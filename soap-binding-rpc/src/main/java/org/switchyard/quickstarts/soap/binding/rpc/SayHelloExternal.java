/*
 * Copyright 2013 Red Hat Inc. and/or its affiliates and other contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.switchyard.quickstarts.soap.binding.rpc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="sayHelloExternal", propOrder={"toWhom", "language", "day"})
@XmlRootElement(name="sayHelloExternal", namespace="urn:switchyard-quickstart:external:1.0")
public class SayHelloExternal {

    String toWhom;
    String language;
    String day;

    public void setToWhom(String t) {
        toWhom = t;
    }

    public String getToWhom() {
        return toWhom;
    }

    public void setLanguage(String l) {
        language = l;
    }

    public String getLanguage() {
        return language;
    }

    public void setDay(String d) {
        day = d;
    }

    public String getDay() {
        return day;
    }
}
