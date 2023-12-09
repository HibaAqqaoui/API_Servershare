import { OpenApiDefinition } from 'open_api_definition';

const apiInstance = new OpenApiDefinition.ControllerApi();


async function browseRemoteDirectoryAsync(path) {
    try {
        const response = await apiInstance.browseRemoteDirectory(path);
        console.log('API called successfully. Returned data:', response.data);
    } catch (error) {
        console.error('Error calling API:', error);
    }
}


async function deleteRemoteFileAsync(path) {
    try {
        const response = await apiInstance.deleteRemoteFile(path);
        console.log('API called successfully. Returned data:', response.data);
    } catch (error) {
        console.error('Error calling API:', error);
    }
}


async function downloadRemoteFileAsync(path) {
    try {
        const response = await apiInstance.downloadRemoteFile(path);
        // Handle the Blob data as needed
        console.log('API called successfully. Returned data:', response);
    } catch (error) {
        console.error('Error calling API:', error);
    }
}


async function renameRemoteFileAsync(oldPath, newPath) {
    try {
        const response = await apiInstance.renameRemoteFile(oldPath, newPath);
        console.log('API called successfully. Returned data:', response.data);
    } catch (error) {
        console.error('Error calling API:', error);
    }
}


async function uploadLocalFileAsync(remotePath, body) {
    try {
        const response = await apiInstance.uploadLocalFile(remotePath, { body });
        console.log('API called successfully. Returned data:', response.data);
    } catch (error) {
        console.error('Error calling API:', error);
    }
}

