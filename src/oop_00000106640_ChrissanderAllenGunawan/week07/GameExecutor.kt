package oop_00000106640_ChrissanderAllenGunawan.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("[BATTLE] Bertemu dengan ${event.monsterName}! Siapkan senjatamu!")
        }

        is BattleState.LootDropped -> {
            println("[LOOT] Item dropped: ${event.item.name} (${event.item.rarity}) - Damage: ${event.item.damage}")
        }

        is BattleState.GameOver -> {
            println("[GAME OVER] ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("[SAFE] Kamu berada di zona aman. Istirahat sejenak...")
        }
    }
}