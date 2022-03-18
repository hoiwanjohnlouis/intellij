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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.datatypes.TagTypeAbstract;

public class Tag33NoLinesOfText extends TagTypeAbstract {
    private final String dataValue;

    public final static String TESTA_NO_LINES_OF_TEXT = "1";
    public final static String TESTB_NO_LINES_OF_TEXT = "3";

    public Tag33NoLinesOfText(String dataValue) {
        setFixType(FIXType.FIX33_NO_LINES_OF_TEXT);
        setDataValue(dataValue);
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag33NoLinesOfText tag33NoLinesOfText = new Tag33NoLinesOfText(TESTA_NO_LINES_OF_TEXT);
        System.out.println(tag33NoLinesOfText);
        System.out.println(tag33NoLinesOfText.toLogStringVerbose());
        System.out.println(tag33NoLinesOfText.toFixTagValuePairString());
    }
}
