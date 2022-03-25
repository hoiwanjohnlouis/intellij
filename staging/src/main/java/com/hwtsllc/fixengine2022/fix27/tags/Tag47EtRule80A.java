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
import com.hwtsllc.fixengine2022.fix27.enums.Enum47Rule80A;

@Deprecated
public class Tag47EtRule80A extends TagTypeAbstract {
    private final Enum47Rule80A dataValue;

    public final static Enum47Rule80A TESTA_ET_RULE_80_A = Enum47Rule80A.AGENCY_SINGLE_ORDER; // fake data
    public final static Enum47Rule80A TESTB_ET_RULE_80_A = Enum47Rule80A.PRINCIPAL;

    public Tag47EtRule80A(Enum47Rule80A dataValue) {
        setFixType(FIXType.FIX47_ET_RULE_80_A);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag47EtRule80A tagData = new Tag47EtRule80A(TESTA_ET_RULE_80_A);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
