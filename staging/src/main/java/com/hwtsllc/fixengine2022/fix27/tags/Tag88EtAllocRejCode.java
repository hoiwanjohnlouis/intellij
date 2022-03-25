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
import com.hwtsllc.fixengine2022.fix27.enums.Enum88AllocRejCode;

public class Tag88EtAllocRejCode extends TagTypeAbstract {
    private final Enum88AllocRejCode dataValue;

    public final static Enum88AllocRejCode TESTA_ET_ALLOC_STATUS = Enum88AllocRejCode.UNKNOWN_ACCOUNT;
    public final static Enum88AllocRejCode TESTB_ET_ALLOC_STATUS = Enum88AllocRejCode.CALCULATION_DIFFERENCE;

    public Tag88EtAllocRejCode(Enum88AllocRejCode dataValue) {
        setFixType(FIXType.FIX88_ET_ALLOC_REJ_CODE);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag88EtAllocRejCode tagData = new Tag88EtAllocRejCode(TESTA_ET_ALLOC_STATUS);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}