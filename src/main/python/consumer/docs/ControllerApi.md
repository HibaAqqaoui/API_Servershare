# OpenApiDefinition.ControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**browseRemoteDirectory**](ControllerApi.md#browseRemoteDirectory) | **GET** /server/browse | 
[**deleteRemoteFile**](ControllerApi.md#deleteRemoteFile) | **DELETE** /server/delete | 
[**downloadRemoteFile**](ControllerApi.md#downloadRemoteFile) | **GET** /server/download | 
[**renameRemoteFile**](ControllerApi.md#renameRemoteFile) | **PUT** /server/rename | 
[**uploadLocalFile**](ControllerApi.md#uploadLocalFile) | **POST** /server/upload | 

<a name="browseRemoteDirectory"></a>
# **browseRemoteDirectory**
> [FileDTO] browseRemoteDirectory(path)



### Example
```javascript
import {OpenApiDefinition} from 'open_api_definition';

let apiInstance = new OpenApiDefinition.ControllerApi();
let path = "path_example"; // String | 

apiInstance.browseRemoteDirectory(path, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 

### Return type

[**[FileDTO]**](FileDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteRemoteFile"></a>
# **deleteRemoteFile**
> APIResponse deleteRemoteFile(path)



### Example
```javascript
import {OpenApiDefinition} from 'open_api_definition';

let apiInstance = new OpenApiDefinition.ControllerApi();
let path = "path_example"; // String | 

apiInstance.deleteRemoteFile(path, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 

### Return type

[**APIResponse**](APIResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="downloadRemoteFile"></a>
# **downloadRemoteFile**
> &#x27;Blob&#x27; downloadRemoteFile(path)



### Example
```javascript
import {OpenApiDefinition} from 'open_api_definition';

let apiInstance = new OpenApiDefinition.ControllerApi();
let path = "path_example"; // String | 

apiInstance.downloadRemoteFile(path, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 

### Return type

**&#x27;Blob&#x27;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="renameRemoteFile"></a>
# **renameRemoteFile**
> APIResponse renameRemoteFile(oldPath, newPath)



### Example
```javascript
import {OpenApiDefinition} from 'open_api_definition';

let apiInstance = new OpenApiDefinition.ControllerApi();
let oldPath = "oldPath_example"; // String | 
let newPath = "newPath_example"; // String | 

apiInstance.renameRemoteFile(oldPath, newPath, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oldPath** | **String**|  | 
 **newPath** | **String**|  | 

### Return type

[**APIResponse**](APIResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="uploadLocalFile"></a>
# **uploadLocalFile**
> APIResponse uploadLocalFile(remotePath, opts)



### Example
```javascript
import {OpenApiDefinition} from 'open_api_definition';

let apiInstance = new OpenApiDefinition.ControllerApi();
let remotePath = "remotePath_example"; // String | 
let opts = { 
  'body': new OpenApiDefinition.ServerUploadBody() // ServerUploadBody | 
};
apiInstance.uploadLocalFile(remotePath, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **remotePath** | **String**|  | 
 **body** | [**ServerUploadBody**](ServerUploadBody.md)|  | [optional] 

### Return type

[**APIResponse**](APIResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

