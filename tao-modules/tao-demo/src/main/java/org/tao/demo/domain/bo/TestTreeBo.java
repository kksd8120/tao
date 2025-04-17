package org.tao.demo.domain.bo;

import org.tao.common.core.validate.AddGroup;
import org.tao.common.core.validate.EditGroup;
import org.tao.common.mybatis.core.domain.BaseEntity;
import org.tao.demo.domain.TestTree;
import io.github.linpeilie.annotations.AutoMapper;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 测试树表业务对象 test_tree
 *
 * @author tao
 * @date 2021-07-26
 */

@Data
@EqualsAndHashCode(callSuper = true)
@AutoMapper(target = TestTree.class, reverseConvertGenerate = false)
public class TestTreeBo extends BaseEntity {

    /**
     * 主键
     */
    @NotNull(message = "主键不能为空", groups = {EditGroup.class})
    private Long id;

    /**
     * 父ID
     */
    private Long parentId;

    /**
     * 部门id
     */
    @NotNull(message = "部门id不能为空", groups = {AddGroup.class, EditGroup.class})
    private Long deptId;

    /**
     * 用户id
     */
    @NotNull(message = "用户id不能为空", groups = {AddGroup.class, EditGroup.class})
    private Long userId;

    /**
     * 树节点名
     */
    @NotBlank(message = "树节点名不能为空", groups = {AddGroup.class, EditGroup.class})
    private String treeName;

}
