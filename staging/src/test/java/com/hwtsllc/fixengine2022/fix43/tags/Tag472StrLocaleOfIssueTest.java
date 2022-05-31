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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  472
 *  LocaleOfIssue
 *  String
 *  <p>
 *  Identifies the locale. For Municipal Security Issuers other than state or province. Refer to
 *  <p>
 *  http://www.atmos.albany.edu/cgi/stagrep-cgi
 *  <p>
 *  Reference the IATA city codes for values.
 *  <p>
 *  Note IATA (International Air Transport Association) maintains the codes at www.iata.org.
 */
class Tag472StrLocaleOfIssueTest {
    @Test
    void FIX0472Test() {
        FIX43 fixData = FIX43.FIX472_STR_LOCALE_OF_ISSUE;
        assertEquals( "472", fixData.toFIXIDString());
        assertEquals( "LOCALE_OF_ISSUE", fixData.toFIXNameString());
        assertEquals( "LocaleOfIssue", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0472Test() {
        Tag472StrLocaleOfIssue tagData;

    }
}