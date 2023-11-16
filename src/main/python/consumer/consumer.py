from swagger_client import ControllerApi


api_client = ControllerApi()


path_to_browse = 'C:\\Users\\asus\\IdeaProjects\\integrate\\src\\drive'
response_browse = api_client.browse_remote_directory(path=path_to_browse)
print("Browse Response:", response_browse)


path_to_delete = 'C:\\Users\\asus\\IdeaProjects\\integrate\\src\\drive\Photo_of_a_kitten-2910914801.jpg'
response_delete = api_client.delete_remote_file(path=path_to_delete)
print("Delete Response:", response_delete)


path_to_download = 'C:\\Users\\asus\\IdeaProjects\\integrate\\src\\drive\Photo_of_a_kitten-2910914801.jpg'
response_download = api_client.download_remote_file(path=path_to_download)
print("Download Response:", response_download)


old_path = 'C:\\Users\\asus\\IdeaProjects\\integrate\\src\\drive\Photo_of_a_kitten-2910914801.jpg'
new_path = 'C:\\Users\\asus\\IdeaProjects\\integrate\\src\\drive\kitten.jpg'
response_rename = api_client.rename_remote_file(old_path=old_path, new_path=new_path)
print("Rename Response:", response_rename)


remote_path = "/path/on/server"
upload_body = ServerUploadBody(...)
response_upload = api_client.upload_local_file(remote_path=remote_path, body=upload_body)
print("Upload Response:", response_upload)
