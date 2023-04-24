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

package com.hwtsllc.fixengine.tags.fix41;

import com.hwtsllc.fixengine.datatypes.FIX41;
import com.hwtsllc.fixengine.datatypes.FIX41Abstract;
import com.hwtsllc.fixengine.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  193
 *  SettlDate2
 *  LocalMktDate
 *  <p></p>
 *  Deprecated in FIX.5.0 SettDate (64) of the future part of a F/X swap order.
 */
// @Deprecated
public class Tag193LmdSettlDate2 extends FIX41Abstract implements LogValuePairString, LogVerboseString {
    private final MyLocalMktDateType dataValue;

    public final static String TESTA_LMD_SETTL_DATE_2
            = "Frodo-Tag193LmdSettlDate2";
    public final static String TESTB_LMD_SETTL_DATE_2
            = "Gandalf-Tag193LmdSettlDate2";

    public Tag193LmdSettlDate2(MyLocalMktDateType dataValue) {
        setFixType(FIX41.FIX193_LMD_SETTL_DATE_2);
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
        Tag193LmdSettlDate2 tagData;

        tagData = new Tag193LmdSettlDate2(new MyLocalMktDateType(TESTA_LMD_SETTL_DATE_2) );
        System.out.println( tagData.toVerboseString() );

        tagData = new Tag193LmdSettlDate2(new MyLocalMktDateType(TESTB_LMD_SETTL_DATE_2) );
        System.out.println( tagData.toVerboseString() );
    }
}
