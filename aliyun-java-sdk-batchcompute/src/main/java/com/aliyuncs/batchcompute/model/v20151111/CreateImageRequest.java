/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyuncs.batchcompute.model.v20151111;

import com.aliyuncs.batchcompute.main.v20151111.BatchComputeRequest;
import com.aliyuncs.batchcompute.pojo.v20151111.Image;
import com.aliyuncs.batchcompute.pojo.v20151111.ImageDescription;
import com.aliyuncs.batchcompute.transform.v20151111.CreateImageRequestMarshaller;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateImageRequest extends BatchComputeRequest<CreateImageResponse> {

	public CreateImageRequest() {
		super("BatchCompute", "2015-11-11", "CreateImage");
		setUriPattern("/images");
		setMethod(MethodType.POST);
	}

	private String IdempotentToken;

	public String getIdempotentToken() {
		return IdempotentToken;
	}

	public void setIdempotentToken(String idempotentToken) {
		IdempotentToken = idempotentToken;
		this.putQueryParameter("IdempotentToken",idempotentToken);
	}



	private ImageDescription imageDescription;

	public ImageDescription getImageDescription() {
		return imageDescription;
	}

	public void setImageDescription(ImageDescription imageDescription) throws ClientException {
		this.imageDescription = imageDescription;
		CreateImageRequestMarshaller.marshall(this);
	}


	@Override
	public Class<CreateImageResponse> getResponseClass() {
		return CreateImageResponse.class;
	}

}
