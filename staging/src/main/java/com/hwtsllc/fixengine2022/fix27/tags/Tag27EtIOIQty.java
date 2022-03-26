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
import com.hwtsllc.fixengine2022.fix27.enums.Enum27IOIQty;

public class Tag27EtIOIQty extends TagTypeAbstract {
    private final Enum27IOIQty dataValue;

    public final static Enum27IOIQty TESTA_ET_IOI_QTY = Enum27IOIQty.ONE_BILLION; // fake data
    public final static Enum27IOIQty TESTB_ET_IOI_QTY = Enum27IOIQty.UNDISCLOSED_QUANTITY;

    public Tag27EtIOIQty(Enum27IOIQty dataValue) {
        setFixType(FIXType.FIX27_ET_IOI_SHARES);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag27EtIOIQty tagData;
        tagData = new Tag27EtIOIQty( TESTA_ET_IOI_QTY);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
        tagData = new Tag27EtIOIQty(TESTB_ET_IOI_QTY);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
