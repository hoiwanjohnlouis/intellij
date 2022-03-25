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
import com.hwtsllc.fixengine2022.fix27.enums.Enum103OrdRejReason;

public class Tag103EtOrdRejReason extends TagTypeAbstract {
    private Enum103OrdRejReason dataValue;

    public final static Enum103OrdRejReason TESTA_ET_ORD_REJ_REASON = Enum103OrdRejReason.BROKER_OR_EXCHANGE;
    public final static Enum103OrdRejReason TESTB_ET_ORD_REJ_REASON = Enum103OrdRejReason.OTHER;

    public Tag103EtOrdRejReason(Enum103OrdRejReason dataValue) {
        setFixType(FIXType.FIX103_ET_ORD_REJ_REASON);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag103EtOrdRejReason tag103EtOrdRejReason = new Tag103EtOrdRejReason(TESTA_ET_ORD_REJ_REASON);
        System.out.println(Enum103OrdRejReason.OTHER);
        System.out.println(tag103EtOrdRejReason);
        System.out.println(tag103EtOrdRejReason.toFixTagValuePairString());
    }
}
