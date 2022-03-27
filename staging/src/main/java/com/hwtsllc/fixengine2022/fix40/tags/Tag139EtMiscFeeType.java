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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.datatypes.TagTypeAbstract;
import com.hwtsllc.fixengine2022.fix40.enums.Enum139MiscFeeType;

public class Tag139EtMiscFeeType extends TagTypeAbstract {
    private final Enum139MiscFeeType dataValue;

    public final static Enum139MiscFeeType TESTA_ET_MISC_FEE_TYPE = Enum139MiscFeeType.REGULATORY; // fake data
    public final static Enum139MiscFeeType TESTB_ET_MISC_FEE_TYPE = Enum139MiscFeeType.TRANSFER_FEE;

    public Tag139EtMiscFeeType(Enum139MiscFeeType dataValue) {
        setFixType(FIXType.FIX139_ET_MISC_FEE_TYPE);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    public static void main(String[] args) {
        Tag139EtMiscFeeType tagData = new Tag139EtMiscFeeType(TESTA_ET_MISC_FEE_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}