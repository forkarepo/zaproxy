/*
 * Zed Attack Proxy (ZAP) and its related class files.
 * 
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0 
 *   
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 */
package org.zaproxy.zap.extension.api;

import java.util.ArrayList;
import java.util.List;

public class ApiAction {

	private String name = null;
	private List<String> paramNames = new ArrayList<String>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ApiAction(String name) {
		super();
		this.name = name;
	}
	
	public ApiAction(String name, List<String> paramNames) {
		super();
		this.name = name;
		this.paramNames = paramNames;
	}
	
	public void setParamNames(List<String> paramNames) {
		this.paramNames = paramNames;
	}

	public List<String> getParamNames() {
		return paramNames;
	}

}
