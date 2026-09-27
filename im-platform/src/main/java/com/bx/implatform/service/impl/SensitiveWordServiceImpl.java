package com.bx.implatform.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bx.implatform.entity.SensitiveWord;
import com.bx.implatform.mapper.SensitiveWordMapper;
import com.bx.implatform.service.SensitiveWordService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SensitiveWordServiceImpl extends ServiceImpl<SensitiveWordMapper, SensitiveWord> implements SensitiveWordService {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(SensitiveWordServiceImpl.class);

    @Override
    public List<String> findAllEnabledWords() {
        LambdaQueryWrapper<SensitiveWord> wrapper = Wrappers.lambdaQuery();
        wrapper.eq(SensitiveWord::getEnabled, true);
        wrapper.select(SensitiveWord::getContent);
        List<SensitiveWord> words = this.list(wrapper);
        return words.stream().map(SensitiveWord::getContent).collect(Collectors.toList());
    }

    public SensitiveWordServiceImpl() {
    }
}
