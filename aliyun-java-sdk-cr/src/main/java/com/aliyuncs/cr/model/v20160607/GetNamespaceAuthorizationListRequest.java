/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cr.model.v20160607;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetNamespaceAuthorizationListRequest extends RoaAcsRequest<GetNamespaceAuthorizationListResponse> {
	
	public GetNamespaceAuthorizationListRequest() {
		super("cr", "2016-06-07", "GetNamespaceAuthorizationList");
		setUriPattern("/namespace/[Namespace]/authorizations");
		setMethod(MethodType.GET);
	}

	private String namespace;

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		putPathParameter("Namespace", namespace);
	}

	@Override
	public Class<GetNamespaceAuthorizationListResponse> getResponseClass() {
		return GetNamespaceAuthorizationListResponse.class;
	}

}