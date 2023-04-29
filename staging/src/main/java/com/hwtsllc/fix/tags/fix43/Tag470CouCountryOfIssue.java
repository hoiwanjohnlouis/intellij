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
import com.hwtsllc.fix.datatypes.MyCountryType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  470
 *  CountryOfIssue
 *  Country
 *  <p></p>
 *  ISO Country code of instrument issue (e.g. the country portion typically used in ISIN).
 *  <p></p>
 *  Can be used in conjunction with non-ISIN SecurityID (48)
 *  <p></p>
 *  (e.g. CUSIP for Municipal Bonds without ISIN) to provide uniqueness.
 */
public class Tag470CouCountryOfIssue extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyCountryType dataValue;

    public final static String TESTA_COU_COUNTRY_OF_ISSUE
            = "BilboBaggins-Tag470CouCountryOfIssue";
    public final static String TESTB_COU_COUNTRY_OF_ISSUE
            = "Gandalf-Tag470CouCountryOfIssue";

    public Tag470CouCountryOfIssue(MyCountryType dataValue) {
        setFixType(FIX43.FIX470_COU_COUNTRY_OF_ISSUE);
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
        Tag470CouCountryOfIssue tagData;

        tagData = new Tag470CouCountryOfIssue(new MyCountryType( TESTA_COU_COUNTRY_OF_ISSUE ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag470CouCountryOfIssue(new MyCountryType( TESTB_COU_COUNTRY_OF_ISSUE ) );
        System.out.println(tagData.toVerboseString());
    }
}
