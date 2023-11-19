const axios = require('axios');

class ControllerApiClient {
    constructor() {
        this.baseURL = 'http://localhost:3000/api';
    }

    async browseRemoteDirectory(path) {
        try {
            const response = await axios.get(`${this.baseURL}/browse_remote_directory`, { params: { path } });
            console.log('Browse Response:', response.data);
            return response.data;
        } catch (error) {
            console.error('Error during browse:', error);
            throw error;
        }
    }

    async deleteRemoteFile(path) {
        try {
            const response = await axios.delete(`${this.baseURL}/delete_remote_file`, { params: { path } });
            console.log('Delete Response:', response.data);
            return response.data;
        } catch (error) {
            console.error('Error during delete:', error);
            throw error;
        }
    }

    async downloadRemoteFile(path) {
        try {
            const response = await axios.get(`${this.baseURL}/download_remote_file`, { params: { path } });
            console.log('Download Response:', response.data);
            return response.data;
        } catch (error) {
            console.error('Error during download:', error);
            throw error;
        }
    }

    async renameRemoteFile(oldPath, newPath) {
        try {
            const response = await axios.put(`${this.baseURL}/rename_remote_file`, { oldPath, newPath });
            console.log('Rename Response:', response.data);
            return response.data;
        } catch (error) {
            console.error('Error during rename:', error);
            throw error;
        }
    }

    async uploadLocalFile(remotePath, body) {
        try {
            const response = await axios.post(`${this.baseURL}/upload_local_file`, { remotePath, body });
            console.log('Upload Response:', response.data);
            return response.data;
        } catch (error) {
            console.error('Error during upload:', error);
            throw error;
        }
    }
}

async function main() {
    const apiClient = new ControllerApiClient();

    try {
        const pathToBrowse = '/path/to/browse';
        const browseResponse = await apiClient.browseRemoteDirectory(pathToBrowse);

        const pathToDelete = '/path/to/delete';
        const deleteResponse = await apiClient.deleteRemoteFile(pathToDelete);

        const pathToDownload = '/path/to/download';
        const downloadResponse = await apiClient.downloadRemoteFile(pathToDownload);

        const oldPath = '/path/to/old';
        const newPath = '/path/to/new';
        const renameResponse = await apiClient.renameRemoteFile(oldPath, newPath);

        const remotePath = '/path/on/server';
        const uploadBody = {   file: {

                data: '',
                name: 'kitten.jpg',
                type: 'image/jpeg',
            } };
        const uploadResponse = await apiClient.uploadLocalFile(remotePath, uploadBody);
    } catch (error) {
        console.error('An error occurred:', error);
    }
}

main();