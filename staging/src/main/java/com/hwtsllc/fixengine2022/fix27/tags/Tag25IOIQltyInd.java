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

public class Tag25IOIQltyInd extends TagTypeAbstract {
    private final String dataValue;

    public final static String TESTA_IOI_QLTY_IND = "BilboBaggins-25-IOIQltyInd"; // fake data
    public final static String TESTB_IOI_QLTY_IND = "Gandalf-25-IOIQltyInd";

    public Tag25IOIQltyInd(String dataValue) {
        setFixType(FIXType.FIX25_IOI_QLTY_IND);
        setDataValue(dataValue);
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag25IOIQltyInd tagData = new Tag25IOIQltyInd(TESTA_IOI_QLTY_IND);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
