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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.datatypes.FieldType;

import com.hwtsllc.fixengine2022.datatypes.TagTypeAbstract;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Tag55Symbol extends TagTypeAbstract {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    public final static String TESTA_TICKER_SYMBOL = "TESTA_SYMBOL";
    public final static String TESTB_TICKER_SYMBOL = "TESTB_SYMBOL";

    public Tag55Symbol(String dataValue) {
        setFixType(FIXType.FIX55_SYMBOL);
        setDataValue(dataValue);
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag55Symbol tag55Symbol = new Tag55Symbol("MSFT");
        System.out.println(tag55Symbol);
        System.out.println(tag55Symbol.toLogStringVerbose());
        System.out.println(tag55Symbol.toFixTagValuePairString());
    }
}
