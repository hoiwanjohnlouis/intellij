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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  915
 *  AgreementDate
 *  LocalMktDate
 *  <p></p>
 *  A reference to the date the underlying agreement specified by
 *  AgreementID and AgreementDesc was executed.
 */
public class Tag915LmdAgreementDate extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyLocalMktDateType dataValue;

    public final static String TESTA_LMD_AGREEMENT_DATE
            = "200507_qiana_chase-Tag915LmdAgreementDate";
    public final static String TESTB_LMD_AGREEMENT_DATE
            = "195807_linne_nanette_ahlstrand-Tag915LmdAgreementDate";

    public Tag915LmdAgreementDate(MyLocalMktDateType dataValue) {
        setFixType( FIX44.FIX915_LMD_AGREEMENT_DATE );
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
        return this.dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag915LmdAgreementDate tagData;

        tagData = new Tag915LmdAgreementDate(new MyLocalMktDateType( TESTA_LMD_AGREEMENT_DATE ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag915LmdAgreementDate(new MyLocalMktDateType( TESTB_LMD_AGREEMENT_DATE ) );
        System.out.println(tagData.toVerboseString());
    }
}
