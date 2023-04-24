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

package com.hwtsllc.fixengine.tags.fix44;

import com.hwtsllc.fixengine.datatypes.FIX44;
import com.hwtsllc.fixengine.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  866
 *  EventDate
 *  LocalMktDate
 *  <p></p>
 *  Date of event
 */
public class Tag866LmdEventDate extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyLocalMktDateType dataValue;

    public final static String TESTA_LMD_EVENT_DATE
            = "198507_hope_marie_carlton-Tag866LmdEventDate";
    public final static String TESTB_LMD_EVENT_DATE
            = "198712_india_allen-Tag866LmdEventDate";

    public Tag866LmdEventDate(MyLocalMktDateType dataValue) {
        setFixType( FIX44.FIX866_LMD_EVENT_DATE );
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
        Tag866LmdEventDate tagData;

        tagData = new Tag866LmdEventDate(new MyLocalMktDateType( TESTA_LMD_EVENT_DATE ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag866LmdEventDate(new MyLocalMktDateType( TESTB_LMD_EVENT_DATE ) );
        System.out.println(tagData.toVerboseString());
    }
}
