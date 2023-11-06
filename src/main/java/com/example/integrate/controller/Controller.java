package com.example.integrate.controller;


import com.example.integrate.model.APIResponse;
import com.example.integrate.model.FileDTO;
import com.example.integrate.service.service;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;



import java.util.List;

@RestController
@RequestMapping("/server")
public class Controller {

    private final service fileService;

    public Controller(service fileService) {
        this.fileService = fileService;
    }


    // Browse the remote shared folder, including its sub-folders
    @GetMapping("/browse")
    public ResponseEntity<List<FileDTO>> browseRemoteDirectory(@RequestParam String path) {
        List<FileDTO> files = fileService.browseRemoteDirectory(path);
        return ResponseEntity.ok(files);
    }

    // Rename a remote shared file or sub-folder
    @PutMapping("/rename")
    public ResponseEntity<APIResponse> renameRemoteFile(
            @RequestParam String oldPath, @RequestParam String newPath) {
        boolean success = fileService.renameRemoteFile(oldPath, newPath);
        if (success) {
            return ResponseEntity.ok(new APIResponse("File renamed successfully"));
        } else {
            return ResponseEntity.badRequest().body(new APIResponse("Failed to rename file"));
        }
    }

    // Download a remote shared file
    @GetMapping("/download")
    public ResponseEntity<Resource> downloadRemoteFile(@RequestParam String path) {
        Resource resource = fileService.downloadRemoteFile(path);
        // Add headers for the response to specify content type and attachment
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + resource.getFilename());
        return ResponseEntity.ok()
                .headers(headers)
                .body(resource);
    }

    // Upload a local file to a specified path under the remote shared folder
    @PostMapping("/upload")
    public ResponseEntity<APIResponse> uploadLocalFile(
            @RequestParam String remotePath, @RequestParam("file") MultipartFile file) {
        boolean success = fileService.uploadLocalFile(remotePath, file);
        if (success) {
            return ResponseEntity.ok(new APIResponse("File uploaded successfully"));
        } else {
            return ResponseEntity.badRequest().body(new APIResponse("Failed to upload file"));
        }
    }

    // Delete a shared remote file
    @DeleteMapping("/delete")
    public ResponseEntity<APIResponse> deleteRemoteFile(@RequestParam String path) {
        boolean success = fileService.deleteRemoteFile(path);
        if (success) {
            return ResponseEntity.ok(new APIResponse("File deleted successfully"));
        } else {
            return ResponseEntity.badRequest().body(new APIResponse("Failed to delete file"));
        }
    }

}
