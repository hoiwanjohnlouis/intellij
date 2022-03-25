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
import com.hwtsllc.fixengine2022.fix27.enums.Enum25IOIQltyInd;

public class Tag25EtIOIQltyInd extends TagTypeAbstract {
    private final Enum25IOIQltyInd dataValue;

    public final static Enum25IOIQltyInd TESTA_ET_IOI_QLTY_IND = Enum25IOIQltyInd.LOW; // fake data
    public final static Enum25IOIQltyInd TESTB_ET_IOI_QLTY_IND = Enum25IOIQltyInd.HIGH;

    public Tag25EtIOIQltyInd(Enum25IOIQltyInd dataValue) {
        setFixType(FIXType.FIX25_ET_IOI_QLTY_IND);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag25EtIOIQltyInd tagData = new Tag25EtIOIQltyInd(TESTA_ET_IOI_QLTY_IND);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
