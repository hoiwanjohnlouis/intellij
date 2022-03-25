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
import com.hwtsllc.fixengine2022.fix27.enums.Enum87AllocStatus;

public class Tag87EtAllocStatus extends TagTypeAbstract {
    private final Enum87AllocStatus dataValue;

    public final static Enum87AllocStatus TESTA_ET_ALLOC_STATUS = Enum87AllocStatus.ACCEPTED;
    public final static Enum87AllocStatus TESTB_ET_ALLOC_STATUS = Enum87AllocStatus.ALLOCATION_PENDING;

    public Tag87EtAllocStatus(Enum87AllocStatus dataValue) {
        setFixType(FIXType.FIX87_ET_ALLOC_STATUS);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag87EtAllocStatus tagData = new Tag87EtAllocStatus(TESTA_ET_ALLOC_STATUS);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}