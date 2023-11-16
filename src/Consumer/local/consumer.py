import requests

# Define the base URL of the API
base_url = "http://localhost:8080/server"

# Function to browse the remote directory
def browse_remote_directory(path):
    url = f"{base_url}/browse"
    params = {"path": path}
    response = requests.get(url, params=params)
    return response.json()

# Function to rename a remote file
def rename_remote_file(old_path, new_path):
    url = f"{base_url}/rename"
    data = {"oldPath": old_path, "newPath": new_path}
    response = requests.put(url, data=data)
    return response.json()

# Function to download a remote file
def download_remote_file(path):
    url = f"{base_url}/download"
    params = {"path": path}
    response = requests.get(url, params=params)

    # You can save the downloaded file to disk if needed
    # with open(path.split("/")[-1], 'wb') as file:
    #     file.write(response.content)

    return response

# Function to upload a local file to a remote path
def upload_local_file(remote_path, file_path):
    url = f"{base_url}/upload"
    files = {"file": (file_path, open(file_path, 'rb'))}
    data = {"remotePath": remote_path}
    response = requests.post(url, data=data, files=files)
    return response.json()

# Function to delete a remote file
def delete_remote_file(path):
    url = f"{base_url}/delete"
    params = {"path": path}
    response = requests.delete(url, params=params)
    return response.json()

# Example usage:
if __name__ == "__main__":
    path_to_browse = "/some/remote/directory"
    print(browse_remote_directory(path_to_browse))

    old_path = "/old/file.txt"
    new_path = "/new/file.txt"
    print(rename_remote_file(old_path, new_path))

    path_to_download = "/file/to/download.txt"
    response = download_remote_file(path_to_download)
    with open(path_to_download, 'wb') as file:
        file.write(response.content)

    remote_path_to_upload = "/remote/upload/path/file.txt"
    local_file_path = "local_file.txt"
    print(upload_local_file(remote_path_to_upload, local_file_path))

    path_to_delete = "/file/to/delete.txt"
    print(delete_remote_file(path_to_delete))
