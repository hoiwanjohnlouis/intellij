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
 *  873
 *  DatedDate
 *  LocalMktDate
 *  <p></p>
 *  The effective date of a new securities issue determined by its underwriters.
 *  <p></p>
 *  Often but not always the same as the Issue Date and the Interest Accrual Date
 */
public class Tag873LmdDatedDate extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyLocalMktDateType dataValue;

    public final static String TESTA_LMD_DATED_DATE
            = "198807_terri_lynn_doss-Tag873LmdDatedDate";
    public final static String TESTB_LMD_DATED_DATE
            = "199603_priscilla_taylor-Tag873LmdDatedDate";

    public Tag873LmdDatedDate(MyLocalMktDateType dataValue) {
        setFixType( FIX44.FIX873_LMD_DATED_DATE );
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
        Tag873LmdDatedDate tagData;

        tagData = new Tag873LmdDatedDate(new MyLocalMktDateType( TESTA_LMD_DATED_DATE ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag873LmdDatedDate(new MyLocalMktDateType( TESTB_LMD_DATED_DATE ) );
        System.out.println(tagData.toVerboseString());
    }
}
