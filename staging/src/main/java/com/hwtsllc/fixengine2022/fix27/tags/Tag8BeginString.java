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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.datatypes.TagTypeAbstract;
import com.hwtsllc.fixengine2022.fix27.enums.Enum8BeginString;

public class Tag8BeginString extends TagTypeAbstract {
    private Enum8BeginString dataValue;

    public final static Enum8BeginString TESTA_BEGIN_STRING = Enum8BeginString.BEGIN_STRING_2_7;
    public final static Enum8BeginString TESTB_BEGIN_STRING = Enum8BeginString.BEGIN_STRING_4_0;

    public Tag8BeginString(Enum8BeginString dataValue) {
        setFixType(FIXType.FIX8_BEGIN_STRING);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag8BeginString tagData = new Tag8BeginString(TESTA_BEGIN_STRING);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
