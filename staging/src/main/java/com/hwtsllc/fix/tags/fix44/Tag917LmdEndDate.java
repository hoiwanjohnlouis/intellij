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

package com.hwtsllc.fix.tags.fix44;

import com.hwtsllc.fix.datatypes.FIX44;
import com.hwtsllc.fix.datatypes.FIX44Abstract;
import com.hwtsllc.fix.datatypes.MyLocalMktDateType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  917
 *  EndDate
 *  LocalMktDate
 *  <p></p>
 *  End date of a financing deal,
 *  i.e. the date the seller reimburses the buyer and takes back control of the collateral
 */
public class Tag917LmdEndDate extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyLocalMktDateType dataValue;

    public final static String TESTA_LMD_END_DATE
            = "196604_karla_conway-Tag917LmdEndDate";
    public final static String TESTB_LMD_END_DATE
            = "196609_dianne_chandler-Tag917LmdEndDate";

    public Tag917LmdEndDate(MyLocalMktDateType dataValue) {
        setFixType( FIX44.FIX917_LMD_END_DATE );
        this.dataValue = dataValue;
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
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                ;
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag917LmdEndDate tagData;

        tagData = new Tag917LmdEndDate(new MyLocalMktDateType( TESTA_LMD_END_DATE ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag917LmdEndDate(new MyLocalMktDateType( TESTB_LMD_END_DATE ) );
        System.out.println(tagData.toVerboseString());
    }
}
