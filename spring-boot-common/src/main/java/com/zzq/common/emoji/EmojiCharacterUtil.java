/**
 *   Copyright  :  www.aposoft.cn
 */
package com.zzq.common.emoji;

/**
 * 用于过滤表情字符的工具类
 * 
 * 需要过滤 D800 ~ DFFF区域字符
 * 
 * @see Character.UnicodeBlock
 * @see Character.UnicodeBlock#HIGH_SURROGATES
 * @see Character.UnicodeBlock#HIGH_PRIVATE_USE_SURROGATES
 * @see Character.UnicodeBlock#LOW_SURROGATES
 * 
 *      <pre>
Unicode 到目前为止所定义的五个平面中，第0平面(BMP)最为重要，其编码分布如下：
注：中文范围 4E00-9FBF：CJK 统一表意符号 (CJK Unified Ideographs)
0000-007F：C0控制符及基本拉丁文 (C0 Control and Basic Latin)
0080-00FF：C1控制符及拉丁文补充-1 (C1 Control and Latin 1 Supplement)
0100-017F：拉丁文扩展-A (Latin Extended-A)
0180-024F：拉丁文扩展-B (Latin Extended-B)
0250-02AF：国际音标扩展 (IPA Extensions)
02B0-02FF：空白修饰字母 (Spacing Modifiers)
0300-036F：结合用读音符号 (Combining Diacritics Marks)
0370-03FF：希腊文及科普特文 (Greek and Coptic)
0400-04FF：西里尔字母(Cyrillic)
0500-052F：西里尔字母补充 (Cyrillic Supplement)
0530-058F：亚美尼亚语 (Armenian)
0590-05FF：希伯来文 (Hebrew)
0600-06FF：阿拉伯文 (Arabic)
0700-074F：叙利亚文 (Syriac)
0750-077F：阿拉伯文补充 (Arabic Supplement)
0780-07BF：马尔代夫语 (Thaana)
07C0-077F：西非书面语言 (N'Ko)
0800-085F：阿维斯塔语及巴列维语(Avestan and Pahlavi)
0860-087F：Mandaic
0880-08AF：撒马利亚语 (Samaritan)
0900-097F：天城文书 (Devanagari)
0980-09FF：孟加拉语 (Bengali)
0A00-0A7F：锡克教文 (Gurmukhi)
0A80-0AFF：古吉拉特文 (Gujarati)
0B00-0B7F：奥里亚文 (Oriya)
0B80-0BFF：泰米尔文 (Tamil)
0C00-0C7F：泰卢固文 (Telugu)
0C80-0CFF：卡纳达文 (Kannada)
0D00-0D7F：德拉维族语 (Malayalam)
0D80-0DFF：僧伽罗语 (Sinhala)
0E00-0E7F：泰文 (Thai)
0E80-0EFF：老挝文 (Lao)
0F00-0FFF：藏文 (Tibetan)
1000-109F：缅甸语 (Myanmar)
10A0-10FF：格鲁吉亚语(Georgian)
1100-11FF：朝鲜文 (Hangul Jamo)
1200-137F：埃塞俄比亚语 (Ethiopic)
1380-139F：埃塞俄比亚语补充 (Ethiopic Supplement)
13A0-13FF：切罗基语 (Cherokee)
1400-167F：统一加拿大土著语音节 (Unified Canadian Aboriginal Syllabics)
1680-169F：欧甘字母 (Ogham)
16A0-16FF：如尼文(Runic)
1700-171F：塔加拉语 (Tagalog)
1720-173F：Hanunóo
1740-175F：Buhid
1760-177F：Tagbanwa
1780-17FF：高棉语 (Khmer)
1800-18AF：蒙古文 (Mongolian)
18B0-18FF：Cham
1900-194F：Limbu
1950-197F：德宏泰语 (Tai Le)
1980-19DF：新傣仂语 (New Tai Lue)
19E0-19FF：高棉语记号 (Kmer Symbols)
1A00-1A1F：Buginese
1A20-1A5F：Batak
1A80-1AEF：Lanna
1B00-1B7F：巴厘语 (Balinese)
1B80-1BB0：巽他语 (Sundanese)
1BC0-1BFF：Pahawh Hmong
1C00-1C4F：雷布查语(Lepcha)
1C50-1C7F：Ol Chiki
1C80-1CDF：曼尼普尔语(Meithei/Manipuri)
1D00-1D7F：语音学扩展 (Phonetic Extensions)
1D80-1DBF：语音学扩展补充  (Phonetic Extensions Supplement)
1DC0-1DFF：结合用读音符号补充 (Combining Diacritics Marks Supplement)
1E00-1EFF：拉丁文扩充附加 (Latin Extended Additional)
1F00-1FFF：希腊语扩充 (Greek Extended)
2000-206F：常用标点(General Punctuation)
2070-209F：上标及下标 (Superscripts and Subscripts)
20A0-20CF：货币符号 (Currency Symbols)
20D0-20FF：组合用记号 (Combining Diacritics Marks for Symbols)
2100-214F：字母式符号 (Letterlike Symbols)
2150-218F：数字形式 (Number Form)
2190-21FF：箭头 (Arrows)
2200-22FF：数学运算符 (Mathematical Operator)
2300-23FF：杂项工业符号 (Miscellaneous Technical)
2400-243F：控制图片 (Control Pictures)
2440-245F：光学识别符 (Optical Character Recognition)
2460-24FF：封闭式字母数字 (Enclosed Alphanumerics)
2500-257F：制表符 (Box Drawing)
2580-259F：方块元素 (Block Element)
25A0-25FF：几何图形 (Geometric Shapes)
2600-26FF：杂项符号 (Miscellaneous Symbols)
2700-27BF：印刷符号 (Dingbats)
27C0-27EF：杂项数学符号-A (Miscellaneous Mathematical Symbols-A)
27F0-27FF：追加箭头-A (Supplemental Arrows-A)
2800-28FF：盲文点字模型 (Braille Patterns)
2900-297F：追加箭头-B (Supplemental Arrows-B)
2980-29FF：杂项数学符号-B (Miscellaneous Mathematical Symbols-B)
2A00-2AFF：追加数学运算符 (Supplemental Mathematical Operator)
2B00-2BFF：杂项符号和箭头 (Miscellaneous Symbols and Arrows)
2C00-2C5F：格拉哥里字母(Glagolitic)
2C60-2C7F：拉丁文扩展-C (Latin Extended-C)
2C80-2CFF：古埃及语 (Coptic)
2D00-2D2F：格鲁吉亚语补充 (Georgian Supplement)
2D30-2D7F：提非纳文 (Tifinagh)
2D80-2DDF：埃塞俄比亚语扩展 (Ethiopic Extended)
2E00-2E7F：追加标点 (Supplemental Punctuation)
2E80-2EFF：CJK 部首补充 (CJK Radicals Supplement)
2F00-2FDF：康熙字典部首 (Kangxi Radicals)
2FF0-2FFF：表意文字描述符 (Ideographic Description Characters)
3000-303F：CJK 符号和标点 (CJK Symbols and Punctuation)
3040-309F：日文平假名 (Hiragana)
30A0-30FF：日文片假名 (Katakana)
3100-312F：注音字母 (Bopomofo)
3130-318F：朝鲜文兼容字母 (Hangul Compatibility Jamo)
3190-319F：象形字注释标志 (Kanbun)
31A0-31BF：注音字母扩展 (Bopomofo Extended)
31C0-31EF：CJK 笔画 (CJK Strokes)
31F0-31FF：日文片假名语音扩展 (Katakana Phonetic Extensions)
3200-32FF：封闭式 CJK 文字和月份 (Enclosed CJK Letters and Months)
3300-33FF：CJK 兼容 (CJK Compatibility)
3400-4DBF：CJK 统一表意符号扩展 A (CJK Unified Ideographs Extension A)
4DC0-4DFF：易经六十四卦符号 (Yijing Hexagrams Symbols)
4E00-9FBF：CJK 统一表意符号 (CJK Unified Ideographs)
A000-A48F：彝文音节 (Yi Syllables)
A490-A4CF：彝文字根 (Yi Radicals)
A500-A61F：Vai
A660-A6FF：统一加拿大土著语音节补充 (Unified Canadian Aboriginal Syllabics Supplement)
A700-A71F：声调修饰字母 (Modifier Tone Letters)
A720-A7FF：拉丁文扩展-D (Latin Extended-D)
A800-A82F：Syloti Nagri
A840-A87F：八思巴字 (Phags-pa)
A880-A8DF：Saurashtra
A900-A97F：爪哇语 (Javanese)
A980-A9DF：Chakma
AA00-AA3F：Varang Kshiti
AA40-AA6F：Sorang Sompeng
AA80-AADF：Newari
AB00-AB5F：越南傣语 (Vi?t Thái)
AB80-ABA0：Kayah Li
AC00-D7AF：朝鲜文音节 (Hangul Syllables)
D800-DBFF：High-half zone of UTF-16
DC00-DFFF：Low-half zone of UTF-16
E000-F8FF：自行使用区域 (Private Use Zone)
F900-FAFF：CJK 兼容象形文字 (CJK Compatibility Ideographs)
FB00-FB4F：字母表达形式 (Alphabetic Presentation Form)
FB50-FDFF：阿拉伯表达形式A (Arabic Presentation Form-A)
FE00-FE0F：变量选择符 (Variation Selector)
FE10-FE1F：竖排形式 (Vertical Forms)
FE20-FE2F：组合用半符号 (Combining Half Marks)
FE30-FE4F：CJK 兼容形式 (CJK Compatibility Forms)
FE50-FE6F：小型变体形式 (Small Form Variants)
FE70-FEFF：阿拉伯表达形式B (Arabic Presentation Form-B)
FF00-FFEF：半型及全型形式 (Halfwidth and Fullwidth Form)
FFF0-FFFF：特殊 (Specials)
 *      </pre>
 * 
 * 
 * @author LiuJian
 * @date 2017年3月13日
 * 
 */
public class EmojiCharacterUtil {
    // 表情符可能存在的开始和截止点
    public static final char EMOJI_MIN = '\uD800';
    public static final char EMOJI_MAX = '\uDFFF';

    // 中文开始截止点
    public static final char CHINESE_MIN = '\u4E00';
    public static final char CHINESE_MAX = '\u9FBF';

    /**
     * 字符串表情符过滤
     * 
     * @param src
     *            传入的字符串
     * @return 过滤后字符串,传入null时,返回null,传入""时,返回空
     */
    public static final String filterEmoji(String src) {
        if (src == null) {
            return null;
        }
        if (src.isEmpty()) {
            return src;
        }
        StringBuilder builder = new StringBuilder(src.length());
        char c;
        for (int i = 0; i < src.length(); i++) {
            c = src.charAt(i);
            if (!isEmoji(c)) {
                builder.append(c);
            }
        }
        return builder.toString();
    }

    /**
     * emoji表情替换 采用正则表达式替换方式
     * 
     * @param source
     *            原字符串
     * @param slipStr
     *            emoji表情替换成的字符串
     * @return 过滤后的字符串
     */
    public static String filterEmoji(String source, String slipStr) {
        if (source == null) {
            return null;
        }
        if (source.isEmpty()) {
            return source;
        }
        // 解释: UTF-16 范围\\ud800\\udc00-\\udbff\\udfff
        // UTF-16 全范围\\ud800-\\udfff
        // 两个范围并不一致, 第一个范围是两个char组成一个有效unicode字符,后面的表示一个char就是单独的unicode字符(暂无定义)
        return source.replaceAll("[\\ud800\\udc00-\\udbff\\udfff\\ud800-\\udfff]", slipStr);

    }

    /**
     * 字符串表情符过滤
     * 
     * @param src
     *            传入的字符串
     * @return 过滤后字符串,传入null时,返回null,传入""时,返回空
     */
    public static final String removeBeyondChinese(String src) {
        if (src == null) {
            return null;
        }
        if (src.isEmpty()) {
            return src;
        }
        StringBuilder builder = new StringBuilder(src.length());
        char c;
        for (int i = 0; i < src.length(); i++) {
            c = src.charAt(i);
            if (isUnderChineseMax(c)) {
                builder.append(c);
            }
        }
        return builder.toString();
    }

    /**
     * 表情符判定 判定字符是是否在 High-half zone of UTF-16 or Low-half zone of UTF-16
     * 
     * @param c
     *            传入的字符
     * @return 传入字符 是否在 High-half zone of UTF-16 or Low-half zone of UTF-16
     */
    public static final boolean isCjk(char c) {
        return Character.UnicodeBlock.of(c) == Character.UnicodeBlock.CJK_COMPATIBILITY;

    }

    /**
     * 表情符判定 判定字符是是否在 High-half zone of UTF-16 or Low-half zone of UTF-16
     * 
     * @param c
     *            传入的字符
     * @return 传入字符 是否在 High-half zone of UTF-16 or Low-half zone of UTF-16
     */
    public static final boolean isUnderChineseMax(char c) {
        return c <= CHINESE_MAX;
    }

    /**
     * 表情符判定 判定字符是是否在 High-half zone of UTF-16 or Low-half zone of UTF-16
     * 
     * @param c
     *            传入的字符
     * @return 传入字符 是否在 High-half zone of UTF-16 or Low-half zone of UTF-16
     */
    public static final boolean isEmoji(char c) {
        return c >= EMOJI_MIN && c <= EMOJI_MAX;
    }

}
