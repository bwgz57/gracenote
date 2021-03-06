/*
 * Copyright 2013 bwgz.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.bwgz.gracenote.web.api.model;

import com.google.api.client.util.Key;
import com.google.api.client.xml.GenericXml;

public class TVGrid extends GenericXml {
	@Key("TVPROGRAM")
	private TVProgram[] tvProgram;

	@Key("TVAIRING")
	private TVAiring[] tvAiring;

	public TVProgram[] getTvProgram() {
		return tvProgram;
	}

	public void setTvProgram(TVProgram[] tvProgram) {
		this.tvProgram = tvProgram;
	}

	public TVAiring[] getTvAiring() {
		return tvAiring;
	}

	public void setTvAiring(TVAiring[] tvAiring) {
		this.tvAiring = tvAiring;
	}
}	
