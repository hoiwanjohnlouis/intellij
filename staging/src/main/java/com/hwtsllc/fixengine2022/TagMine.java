/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.fixengine2022;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.TagDataAccessors;

public class TagMine extends FIXTypeWrapper implements FixTagValuePairString, TagDataAccessors {
    private String dataValue;

    public TagMine(String dataValue) {
        setFixType(FIXType.FIX58_TEXT);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve this tags data
     */
    @Override
    public String getDataValue() {
        return this.dataValue;
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return String.valueOf(getAction())
                .concat("=")
                .concat(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        TagMine tagMine = new TagMine("hello from main routine");
        System.out.println("t1.1:"+tagMine);
        System.out.println("t1.2.verbose:"+tagMine.toLogStringVerbose());
        System.out.println("t1.7.DataValue:"+tagMine.getDataValue());
        System.out.println("t1.8.FixString:"+tagMine.toFixTagValuePairString());
    }
}
