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
import com.hwtsllc.fixengine2022.fix27.enums.Enum28IOITransType;

public class Tag28IOITransType extends TagTypeAbstract {
    private final Enum28IOITransType dataValue;

    public final static Enum28IOITransType TESTA_IOI_TRANS_TYPE = Enum28IOITransType.NEW;   // fake data
    public final static Enum28IOITransType TESTB_IOI_TRANS_TYPE = Enum28IOITransType.REPLACE;

    public Tag28IOITransType(Enum28IOITransType dataValue) {
        setFixType(FIXType.FIX28_IOI_TRANS_TYPE);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag28IOITransType tagData = new Tag28IOITransType(TESTA_IOI_TRANS_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
