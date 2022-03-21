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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.datatypes.TagTypeAbstract;
import com.hwtsllc.fixengine2022.fix27.enums.EnumBoolean;

public class Tag325UnsolicitedIndicator extends TagTypeAbstract {
    private final EnumBoolean dataValue;

    public final static EnumBoolean TESTA_UNSOLICITED_INDICATOR = EnumBoolean.NO ;
                                    // N - Msg is being sent as a result of a prior request
    public final static EnumBoolean TESTB_UNSOLICITED_INDICATOR = EnumBoolean.YES;
                                    // Y - Msg is being sent unsolicited

    public Tag325UnsolicitedIndicator(EnumBoolean dataValue) {
        setFixType(FIXType.FIX325_UNSOLICITED_INDICATOR);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    public static void main(String[] args) {
        Tag325UnsolicitedIndicator tagData = new Tag325UnsolicitedIndicator(TESTA_UNSOLICITED_INDICATOR);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
