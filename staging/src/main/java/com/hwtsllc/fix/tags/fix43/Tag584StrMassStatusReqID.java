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

package com.hwtsllc.fix.tags.fix43;

import com.hwtsllc.fix.datatypes.FIX43;
import com.hwtsllc.fix.datatypes.FIX43Abstract;
import com.hwtsllc.fix.datatypes.MyStringType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  584
 *  MassStatusReqID
 *  String
 *  <p></p>
 *  Value assigned by issuer of Mass Status Request to uniquely identify the request
 */
public class Tag584StrMassStatusReqID extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_MASS_STATUS_REQ_ID
            = "RobertBoyle-Tag584StrMassStatusReqID";
    public final static String TESTB_STR_MASS_STATUS_REQ_ID
            = "ErnestRutherford-Tag584StrMassStatusReqID";

    public Tag584StrMassStatusReqID(MyStringType dataValue) {
        setFixType(FIX43.FIX584_STR_MASS_STATUS_REQ_ID);
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
        Tag584StrMassStatusReqID tagData;

        tagData = new Tag584StrMassStatusReqID(new MyStringType(TESTA_STR_MASS_STATUS_REQ_ID) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag584StrMassStatusReqID(new MyStringType(TESTB_STR_MASS_STATUS_REQ_ID) );
        System.out.println(tagData.toVerboseString());
    }
}
