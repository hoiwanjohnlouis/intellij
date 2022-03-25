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
import com.hwtsllc.fixengine2022.fix27.enums.Enum5AdvTransType;

public class Tag5EtAdvTransType extends TagTypeAbstract {
    private Enum5AdvTransType dataValue;

    public final static Enum5AdvTransType TESTA_ET_ADV_TRANS_TYPE = Enum5AdvTransType.NEW;
    public final static Enum5AdvTransType TESTB_ET_ADV_TRANS_TYPE = Enum5AdvTransType.REPLACE;

    public Tag5EtAdvTransType(Enum5AdvTransType dataValue) {
        setFixType(FIXType.FIX5_ET_ADV_TRANS_TYPE);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Enum5AdvTransType enumData = TESTA_ET_ADV_TRANS_TYPE;
        Tag5EtAdvTransType tagData = new Tag5EtAdvTransType(enumData);
        System.out.println(enumData);
        System.out.println(tagData);
        System.out.println(tagData.toFixTagValuePairString());
    }
}
