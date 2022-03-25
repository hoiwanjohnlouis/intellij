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
import com.hwtsllc.fixengine2022.fix27.enums.Enum4AdvSide;

public class Tag4EtAdvSide extends TagTypeAbstract {
    private Enum4AdvSide dataValue;

    public final static Enum4AdvSide TESTA_ET_ADV_SIDE = Enum4AdvSide.BUY;
    public final static Enum4AdvSide TESTB_ET_ADV_SIDE = Enum4AdvSide.SELL;

    public Tag4EtAdvSide(Enum4AdvSide dataValue) {
        setFixType(FIXType.FIX4_ET_ADV_SIDE);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag4EtAdvSide tagDataBuy = new Tag4EtAdvSide(Enum4AdvSide.BUY);
        Tag4EtAdvSide tagDataSell = new Tag4EtAdvSide(Enum4AdvSide.SELL);
        Tag4EtAdvSide tagDataCross = new Tag4EtAdvSide(Enum4AdvSide.CROSS);
        Tag4EtAdvSide tagDataTrade = new Tag4EtAdvSide(Enum4AdvSide.TRADE);
        System.out.println(Enum4AdvSide.BUY);
        System.out.println(Enum4AdvSide.SELL);
        System.out.println(Enum4AdvSide.CROSS);
        System.out.println(Enum4AdvSide.TRADE);
        System.out.println(tagDataBuy);
        System.out.println(tagDataSell);
        System.out.println(tagDataCross);
        System.out.println(tagDataTrade);
        System.out.println(tagDataBuy.toFixTagValuePairString());
        System.out.println(tagDataSell.toFixTagValuePairString());
        System.out.println(tagDataCross.toFixTagValuePairString());
        System.out.println(tagDataTrade.toFixTagValuePairString());
    }
}
