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

public class Tag120SettlCurrency extends TagTypeAbstract {
    private final String dataValue;

    public final static String TESTA_SETTL_CURRENCY = "BilboBaggins-120SettlCurrency"; // fake data
    public final static String TESTB_SETTL_CURRENCY = "Gandalf-120SettlCurrency";

    public Tag120SettlCurrency(String dataValue) {
        setFixType(FIXType.FIX120_SETTL_CURRENCY);
        setDataValue(dataValue);
        this.dataValue = dataValue;
    }

    public static void main(String[] args) {
        Tag120SettlCurrency tagData = new Tag120SettlCurrency(TESTA_SETTL_CURRENCY);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
