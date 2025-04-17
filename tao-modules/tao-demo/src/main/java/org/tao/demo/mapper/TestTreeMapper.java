package org.tao.demo.mapper;

import org.tao.common.mybatis.annotation.DataColumn;
import org.tao.common.mybatis.annotation.DataPermission;
import org.tao.common.mybatis.core.mapper.BaseMapperPlus;
import org.tao.demo.domain.TestTree;
import org.tao.demo.domain.vo.TestTreeVo;

/**
 * 测试树表Mapper接口
 *
 * @author tao
 * @date 2021-07-26
 */
@DataPermission({
    @DataColumn(key = "deptName", value = "dept_id"),
    @DataColumn(key = "userName", value = "user_id")
})
public interface TestTreeMapper extends BaseMapperPlus<TestTree, TestTreeVo> {

}
