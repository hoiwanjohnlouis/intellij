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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  490
 *  CardExpDate
 *  LocalMktDate
 *  <p>
 *  The expiry date of the payment card as specified on the card being used for payment.
 */
public class Tag490LmdCardExpDate extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyLocalMktDateType dataValue;

    public final static String TESTA_LMD_CARD_EXP_DATE
            = "Frodo-Tag490LmdCardExpDate";
    public final static String TESTB_LMD_CARD_EXP_DATE
            = "Gandalf-Tag490LmdCardExpDate";

    public Tag490LmdCardExpDate(MyLocalMktDateType dataValue) {
        setFixType(FIX43.FIX490_LMD_CARD_EXP_DATE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getDataValue();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag490LmdCardExpDate tagData;

        tagData = new Tag490LmdCardExpDate(new MyLocalMktDateType(TESTA_LMD_CARD_EXP_DATE) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag490LmdCardExpDate(new MyLocalMktDateType(TESTB_LMD_CARD_EXP_DATE) );
        System.out.println(tagData.toVerboseString());
    }
}
