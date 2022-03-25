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
import com.hwtsllc.fixengine2022.fix27.enums.Enum71AllocTransType;

public class Tag71EtAllocTransType extends TagTypeAbstract {
    private final Enum71AllocTransType dataValue;

    public final static Enum71AllocTransType TESTA_ET_ALLOC_TRANS_TYPE = Enum71AllocTransType.NEW; // fake data
    public final static Enum71AllocTransType TESTB_ET_ALLOC_TRANS_TYPE = Enum71AllocTransType.REVERSAL;

    public Tag71EtAllocTransType(Enum71AllocTransType dataValue) {
        setFixType(FIXType.FIX71_ET_ALLOC_TRANS_TYPE);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag71EtAllocTransType tagData = new Tag71EtAllocTransType(TESTA_ET_ALLOC_TRANS_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}