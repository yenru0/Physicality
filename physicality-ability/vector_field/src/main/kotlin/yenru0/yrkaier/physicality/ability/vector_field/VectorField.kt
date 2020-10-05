package yenru0.yrkaier.physicality.ability.vector_field

import com.github.noonmaru.psychics.Ability
import com.github.noonmaru.psychics.AbilityConcept
import com.github.noonmaru.psychics.ActiveAbility
import com.github.noonmaru.psychics.attribute.EsperAttribute
import com.github.noonmaru.psychics.attribute.EsperStatistic
import com.github.noonmaru.psychics.damage.Damage
import com.github.noonmaru.psychics.damage.DamageType
import com.github.noonmaru.tap.config.Config
import com.github.noonmaru.tap.config.Name
import com.github.noonmaru.tap.config.RangeInt
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

@Name("vector-field")
class VectorFieldConcept : AbilityConcept() {


    @Config
    @RangeInt(min = 0)
    var vectorFieldMaxCount: Int = 5

    init {
        displayName = "벡터 필드"
        castingTicks = 25
        range = 10.0
        interruptible = true
        cost = 54.3
        cooldownTicks = 100
        levelRequirement = 5
        wand = ItemStack(Material.IRON_INGOT)
        damage = Damage(DamageType.RANGED, EsperStatistic.Companion.of(EsperAttribute.ATTACK_DAMAGE to 0.0))
        description = listOf(
            "철괴를 우클릭 시 주변 \${common.range}블럭 내 적들을 띄웁니다.",
            "최대 \${vector-field.vectorFieldMaxCount}명을 띄울 수 있습니다.",
            "띄운 적들은 <damage>의 피해를 입습니다."
        )
    }

}

class VectorField: ActiveAbility<VectorFieldConcept>() {
    onEnable


}