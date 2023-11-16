# swagger_client.ControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**browse_remote_directory**](ControllerApi.md#browse_remote_directory) | **GET** /server/browse | 
[**delete_remote_file**](ControllerApi.md#delete_remote_file) | **DELETE** /server/delete | 
[**download_remote_file**](ControllerApi.md#download_remote_file) | **GET** /server/download | 
[**rename_remote_file**](ControllerApi.md#rename_remote_file) | **PUT** /server/rename | 
[**upload_local_file**](ControllerApi.md#upload_local_file) | **POST** /server/upload | 

# **browse_remote_directory**
> list[FileDTO] browse_remote_directory(path)



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ControllerApi()
path = 'path_example' # str | 

try:
    api_response = api_instance.browse_remote_directory(path)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->browse_remote_directory: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **str**|  | 

### Return type

[**list[FileDTO]**](FileDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_remote_file**
> APIResponse delete_remote_file(path)



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ControllerApi()
path = 'path_example' # str | 

try:
    api_response = api_instance.delete_remote_file(path)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->delete_remote_file: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **str**|  | 

### Return type

[**APIResponse**](APIResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_remote_file**
> str download_remote_file(path)



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ControllerApi()
path = 'path_example' # str | 

try:
    api_response = api_instance.download_remote_file(path)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->download_remote_file: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **str**|  | 

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **rename_remote_file**
> APIResponse rename_remote_file(old_path, new_path)



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ControllerApi()
old_path = 'old_path_example' # str | 
new_path = 'new_path_example' # str | 

try:
    api_response = api_instance.rename_remote_file(old_path, new_path)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->rename_remote_file: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **old_path** | **str**|  | 
 **new_path** | **str**|  | 

### Return type

[**APIResponse**](APIResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **upload_local_file**
> APIResponse upload_local_file(remote_path, body=body)



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ControllerApi()
remote_path = 'remote_path_example' # str | 
body = swagger_client.ServerUploadBody() # ServerUploadBody |  (optional)

try:
    api_response = api_instance.upload_local_file(remote_path, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->upload_local_file: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **remote_path** | **str**|  | 
 **body** | [**ServerUploadBody**](ServerUploadBody.md)|  | [optional] 

### Return type

[**APIResponse**](APIResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

