/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyinteger;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.squareup.okhttp.ResponseBody;
import fixtures.bodyinteger.models.Error;
import java.io.IOException;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

public class IntOperationsImpl implements IntOperations {
    private IntService service;
    AutoRestIntegerTestService client;

    public IntOperationsImpl(Retrofit retrofit, AutoRestIntegerTestService client) {
        this.service = retrofit.create(IntService.class);
        this.client = client;
    }

    /**
     * Get null Int value
     *
     * @return the Integer object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Integer> getNull() throws ServiceException, IOException {
        Call<ResponseBody> call = service.getNull();
        return getNullDelegate(call.execute(), null);
    }

    /**
     * Get null Int value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getNullAsync(final ServiceCallback<Integer> serviceCallback) {
        Call<ResponseBody> call = service.getNull();
        call.enqueue(new ServiceResponseCallback<Integer>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getNullDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Integer> getNullDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<Integer>()
                .register(200, new TypeToken<Integer>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get invalid Int value
     *
     * @return the Integer object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Integer> getInvalid() throws ServiceException, IOException {
        Call<ResponseBody> call = service.getInvalid();
        return getInvalidDelegate(call.execute(), null);
    }

    /**
     * Get invalid Int value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getInvalidAsync(final ServiceCallback<Integer> serviceCallback) {
        Call<ResponseBody> call = service.getInvalid();
        call.enqueue(new ServiceResponseCallback<Integer>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getInvalidDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Integer> getInvalidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<Integer>()
                .register(200, new TypeToken<Integer>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get overflow Int32 value
     *
     * @return the Integer object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Integer> getOverflowInt32() throws ServiceException, IOException {
        Call<ResponseBody> call = service.getOverflowInt32();
        return getOverflowInt32Delegate(call.execute(), null);
    }

    /**
     * Get overflow Int32 value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getOverflowInt32Async(final ServiceCallback<Integer> serviceCallback) {
        Call<ResponseBody> call = service.getOverflowInt32();
        call.enqueue(new ServiceResponseCallback<Integer>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getOverflowInt32Delegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Integer> getOverflowInt32Delegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<Integer>()
                .register(200, new TypeToken<Integer>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get underflow Int32 value
     *
     * @return the Integer object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Integer> getUnderflowInt32() throws ServiceException, IOException {
        Call<ResponseBody> call = service.getUnderflowInt32();
        return getUnderflowInt32Delegate(call.execute(), null);
    }

    /**
     * Get underflow Int32 value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getUnderflowInt32Async(final ServiceCallback<Integer> serviceCallback) {
        Call<ResponseBody> call = service.getUnderflowInt32();
        call.enqueue(new ServiceResponseCallback<Integer>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getUnderflowInt32Delegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Integer> getUnderflowInt32Delegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<Integer>()
                .register(200, new TypeToken<Integer>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get overflow Int64 value
     *
     * @return the Long object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Long> getOverflowInt64() throws ServiceException, IOException {
        Call<ResponseBody> call = service.getOverflowInt64();
        return getOverflowInt64Delegate(call.execute(), null);
    }

    /**
     * Get overflow Int64 value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getOverflowInt64Async(final ServiceCallback<Long> serviceCallback) {
        Call<ResponseBody> call = service.getOverflowInt64();
        call.enqueue(new ServiceResponseCallback<Long>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getOverflowInt64Delegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Long> getOverflowInt64Delegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<Long>()
                .register(200, new TypeToken<Long>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get underflow Int64 value
     *
     * @return the Long object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Long> getUnderflowInt64() throws ServiceException, IOException {
        Call<ResponseBody> call = service.getUnderflowInt64();
        return getUnderflowInt64Delegate(call.execute(), null);
    }

    /**
     * Get underflow Int64 value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getUnderflowInt64Async(final ServiceCallback<Long> serviceCallback) {
        Call<ResponseBody> call = service.getUnderflowInt64();
        call.enqueue(new ServiceResponseCallback<Long>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getUnderflowInt64Delegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Long> getUnderflowInt64Delegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<Long>()
                .register(200, new TypeToken<Long>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Put max int32 value
     *
     * @param intBody the int value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Void> putMax32(int intBody) throws ServiceException, IOException {
        Call<ResponseBody> call = service.putMax32(intBody);
        return putMax32Delegate(call.execute(), null);
    }

    /**
     * Put max int32 value
     *
     * @param intBody the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> putMax32Async(int intBody, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.putMax32(intBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putMax32Delegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putMax32Delegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Put max int64 value
     *
     * @param intBody the long value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Void> putMax64(long intBody) throws ServiceException, IOException {
        Call<ResponseBody> call = service.putMax64(intBody);
        return putMax64Delegate(call.execute(), null);
    }

    /**
     * Put max int64 value
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> putMax64Async(long intBody, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.putMax64(intBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putMax64Delegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putMax64Delegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Put min int32 value
     *
     * @param intBody the int value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Void> putMin32(int intBody) throws ServiceException, IOException {
        Call<ResponseBody> call = service.putMin32(intBody);
        return putMin32Delegate(call.execute(), null);
    }

    /**
     * Put min int32 value
     *
     * @param intBody the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> putMin32Async(int intBody, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.putMin32(intBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putMin32Delegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putMin32Delegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Put min int64 value
     *
     * @param intBody the long value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Void> putMin64(long intBody) throws ServiceException, IOException {
        Call<ResponseBody> call = service.putMin64(intBody);
        return putMin64Delegate(call.execute(), null);
    }

    /**
     * Put min int64 value
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> putMin64Async(long intBody, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.putMin64(intBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putMin64Delegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putMin64Delegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

}
