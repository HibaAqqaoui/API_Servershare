package com.example.integrate.service;

import com.example.integrate.model.FileDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.Resource;
import org.springframework.core.io.FileSystemResource;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class service {

    private static final String remotePath = "/remote/shared/folder";

    // Simulated list of files and folders for demonstration purposes
    private final List<FileDTO> remoteFiles = new ArrayList<>();

    public List<FileDTO> browseRemoteDirectory(String path) {
        // Simulated method to list files and folders in the remote directory

        // For demonstration, let's add some sample files and folders
        List<FileDTO> result = new ArrayList<>();
        for (FileDTO file : remoteFiles) {
            if (file.getPath().startsWith(path)) {
                result.add(file);
            }
        }
        return result;
    }

    public boolean renameRemoteFile(String oldPath, String newPath) {
        // Simulated method to rename a remote file or folder

        // For demonstration, let's update the name of the file/folder in the list
        for (FileDTO file : remoteFiles) {
            if (file.getPath().equals(oldPath)) {
                file.setName(newPath);
                return true;
            }
        }
        return false; // Return false if the file/folder was not found
    }

    public Resource downloadRemoteFile(String path) {
        // Simulated method to download a remote file

        // For demonstration, let's assume the file exists locally
        String localFilePath = "/path/to/local/files" + path; // Replace with the actual path
        File localFile = new File(localFilePath);
        return new FileSystemResource(localFile);
    }

    public boolean uploadLocalFile(String remotePath, MultipartFile file) {
        // Simulated method to upload a local file to a specified path on the remote shared folder

        // For demonstration, let's assume the file is saved locally
        String localFilePath = "/path/to/local/files/" + file.getOriginalFilename(); // Replace with the actual path
        try {
            file.transferTo(new File(localFilePath));
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteRemoteFile(String path) {
        // Simulated method to delete a remote file or folder

        // For demonstration, let's remove the file/folder from the list
        for (FileDTO file : remoteFiles) {
            if (file.getPath().equals(path)) {
                remoteFiles.remove(file);
                return true;
            }
        }
        return false; // Return false if the file/folder was not found
    }
}
