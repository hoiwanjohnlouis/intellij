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

package com.hwtsllc.fixengine.tags.fix42.tags;

import com.hwtsllc.fixengine.datatypes.FIX42;
import com.hwtsllc.fixengine.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  432
 *  ExpireDate
 *  LocalMktDate
 *  <p></p>
 *  Date of order expiration (last day the order can trade),
 *  always expressed in terms of the local market date.
 *  <p></p>
 *  The time at which the order expires is determined by the local market’s business practices
 */
public class Tag432LmdExpireDate extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyLocalMktDateType dataValue;

    public final static String TESTA_LMD_EXPIRE_DATE
            = "Frodo-Tag432LmdExpireDate";
    public final static String TESTB_LMD_EXPIRE_DATE
            = "Gandalf-Tag432LmdExpireDate";

    public Tag432LmdExpireDate(MyLocalMktDateType dataValue) {
        setFixType(FIX42.FIX432_LMD_EXPIRE_DATE);
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
        Tag432LmdExpireDate tagData;

        tagData = new Tag432LmdExpireDate(new MyLocalMktDateType(TESTA_LMD_EXPIRE_DATE) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag432LmdExpireDate(new MyLocalMktDateType(TESTB_LMD_EXPIRE_DATE) );
        System.out.println(tagData.toVerboseString());
    }
}
