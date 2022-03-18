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

public class Tag58Text extends TagTypeAbstract {
    private final String dataValue;

    public final static String TESTA_TEXT = "BilboBaggins-58-ClOrdID"; // fake data
    public final static String TESTB_TEXT = "Gandalf-58-ClOrdID";

    public Tag58Text(String dataValue) {
        setFixType(FIXType.FIX58_TEXT);
        setDataValue(dataValue);
        this.dataValue = dataValue;
    }

    public static void main(String[] args) {
        Tag58Text tag58TExt = new Tag58Text(TESTA_TEXT);
        System.out.println(tag58TExt);
        System.out.println(tag58TExt.toLogStringVerbose());
        System.out.println(tag58TExt.toFixTagValuePairString());
    }
}
