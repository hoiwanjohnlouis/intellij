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

package com.hwtsllc.fixengine2022.fix40;

import com.hwtsllc.fixengine2022.datatypes.AdvSideEnum;
import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.datatypes.TagTypeAbstract;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Tag4AdvSide extends TagTypeAbstract {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private AdvSideEnum advSideEnum;

    public Tag4AdvSide(AdvSideEnum advSideEnum) {
        setFixType(FIXType.FIX4_ADV_SIDE);
        setDataValue(advSideEnum.getAdvSideAction());
        this.advSideEnum = advSideEnum;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag4AdvSide tag4AdvSideBuy = new Tag4AdvSide(AdvSideEnum.BUY);
        Tag4AdvSide tag4AdvSideSell = new Tag4AdvSide(AdvSideEnum.SELL);
        Tag4AdvSide tag4AdvSideCross = new Tag4AdvSide(AdvSideEnum.CROSS);
        Tag4AdvSide tag4AdvSideTrade = new Tag4AdvSide(AdvSideEnum.TRADE);
        System.out.println(AdvSideEnum.BUY);
        System.out.println(AdvSideEnum.SELL);
        System.out.println(AdvSideEnum.CROSS);
        System.out.println(AdvSideEnum.TRADE);
        System.out.println(tag4AdvSideBuy);
        System.out.println(tag4AdvSideSell);
        System.out.println(tag4AdvSideCross);
        System.out.println(tag4AdvSideTrade);
        System.out.println(tag4AdvSideBuy.toFixTagValuePairString());
        System.out.println(tag4AdvSideSell.toFixTagValuePairString());
        System.out.println(tag4AdvSideCross.toFixTagValuePairString());
        System.out.println(tag4AdvSideTrade.toFixTagValuePairString());
    }
}
