package com.dandan.annotation;

/**
 * @Author : HuangDandan
 * @CreateTime : 2018/11/17
 * @Desciption :简单注解
 */
public @interface Annotation01 {

   /** Causes this character sequence to be replaced by the reverse of the sequence. If there are any surrogate pairs included in the sequence, these are treated as single characters for the reverse operation. Thus, the order of the high-low surrogates is never reversed. Let <i>n</i> be the character length of this character sequence (not the length in <code>char</code> values) just prior to execution of the <code>reverse</code> method. Then the character at index <i>k</i> in the new character sequence is equal to the character at index <i>n-k-1</i> in the old character sequence. <p>Note that the reverse operation may result in producing surrogate pairs that were unpaired low-surrogates and high-surrogates before the operation. For example, reversing "&#92;uDC00&#92;uD800" produces "&#92;uD800&#92;uDC00" which is a valid surrogate pair. @return  a reference to this object. */
}
