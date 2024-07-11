package moe.sherry.utils

object Perks {
    private val perks = HashMap<String, String>()
    val all
        get() = perks as Map<String, String>

    init {
        addArmorPerks()
        addWeaponPerks()
    }

    private fun addArmorPerks() {
        perks["war spoils"] = "Dealing Melee damage has a chance to reward random ammo."
        perks["vampire"] = "Dealing Melee damage will regenerate 2 Health."
        perks["iron stomach"] = "Taking Damage will slightly regenerate Hunger."
        perks["damage redirect"] = "When damaged you reflect it back onto enemies."
        perks["freight train"] = "Meleeing an enemy while moving deals 2+ damage and knocks them back."
        perks["light blessing"] = "Provides 2+ Melee Damage during Daytime."
        perks["starvation"] = "Provides 4+ Melee damage at the cost of 2 hunger."
        perks["dark feast"] = "Slightly regenerates Hunger during Nighttime."
        perks["personal space"] = "Taking damage knocks away nearby enemies."
        perks["taking charge"] = "Shooting an enemy will spawn an Orb of Light, collecting it will reward you with 2 Armor Charges (Max 4 Charges)."
        perks["endangered"] = "If you are damaged while below 12 HP you will gain 1 Armor Charge (Max 3 Charges)."
        perks["blood money"] = "Meleeing an enemy will have a 50% Chance to grant you 1 Armor Charge (Max 2 Charges)."
        perks["powerful friends"] = "Shooting an enemy will consume 7 Armor charges and will give all nearly players 9+ Melee Damage for 8 seconds."
        perks["heal thyself"] = "Meleeing an enemy will consume 3 Armor charges and heal 6+ Health."
        perks["high energy fire"] = "Shooting an enemy will consume 1 Armor charge and deal 3+ damage."
        perks["heavy handed"] = "Meleeing an enemy will consume 2 Armor charges and deal 8+ damage."
        perks["strange summon"] = "Taking damage will consume 6 Armor charges and summon a random ally."
        perks["protective light"] = "Taking damage will consume 3 Armor charges and provide 20% Damage resistance for 5 seconds."
        perks["vanguard resistance"] = "When shooting an enemy with 500+ HP you will gain 1 heart of overshield (Max 3 hearts)."

        perks["fallen resistance"] = "When shooting Fallen enemies you will gain 1 heart of overshield (Max 3 hearts)."
        perks["cabal resistance"] = "When shooting Cabal enemies you will gain 1 heart of overshield (Max 3 hearts)."
        perks["vex resistance"] = "When shooting Vex enemies you will gain 1 heart of overshield (Max 3 hearts)."
        perks["darkness resistance"] = "When shooting Hive, Taken or Unspecified enemies you will gain 1 heart of overshield (Max 3 hearts)."
        perks["hive resistance"] = "When shooting the specified Faction you will gain 1 heart of overshield (Max 3 hearts)."

        perks["solar charge"] = "When shooting an enemy afflicted with a Solar, you will gain 1 Armor Charge (Max 5 Charges)."
        perks["arc charge"] = "When shooting an enemy afflicted with a Arc, you will gain 1 Armor Charge (Max 5 Charges)."
        perks["void charge"] = "When shooting an enemy afflicted with a Void, you will gain 1 Armor Charge (Max 5 Charges)."
        perks["stasis charge"] = "When shooting an enemy afflicted with a Stasis, you will gain 1 Armor Charge (Max 5 Charges)."
        perks["strand charge"] = "When shooting an enemy afflicted with a Strand, you will gain 1 Armor Charge (Max 5 Charges)."

        perks["projectile dampener i"] = "Provides 8% (8% per tier) Resistance to enemy projectiles, per tier."
        perks["projectile dampener ii"] = "Provides 16% (8% per tier) Resistance to enemy projectiles, per tier."
        perks["projectile dampener iii"] = "Provides 24% (8% per tier) Resistance to enemy projectiles."

        perks["damage dampener i"] = "Provides 8% (8% per tier) Resistance to all sources of damage."
        perks["damage dampener ii"] = "Provides 16% (8% per tier) Resistance to all sources of damage."
        perks["damage dampener iii"] = "Provides 24% (8% per tier) Resistance to all sources of damage."

        perks["velocity dampener i"] = "Provides 12% (12% per tier) Resistance to fall damage."
        perks["velocity dampener ii"] = "Provides 24% (12% per tier) Resistance to fall damage."
        perks["velocity dampener iii"] = "Provides 36% (12% per tier) Resistance to fall damage."

        perks["solar subclass synergy"] = "Shooting an enemy with a Solar Subclass will provide a 25% Chance to gain 1 Armor Charge (Max 7 Charges)."
        perks["arc subclass synergy"] = "Shooting an enemy with a Arc Subclass will provide a 25% Chance to gain 1 Armor Charge (Max 7 Charges)."
        perks["void subclass synergy"] = "Shooting an enemy with a Void Subclass will provide a 25% Chance to gain 1 Armor Charge (Max 7 Charges)."

        perks["hunter armor"] = "Taking damage while being a Hunter will provide a 25% Chance to gain 1 Armor Charge (Max 7 Charges)."
        perks["warlock armor"] = "Taking damage while being a Warlock will provide a 25% Chance to gain 1 Armor Charge (Max 7 Charges)."
        perks["titan armor"] = "Taking damage while being a Titan will provide a 25% Chance to gain 1 Armor Charge (Max 7 Charges)."

        perks["hunter weaponry"] = "Shooting an enemy while being a Hunter will provide a 25% Chance to gain 1 Armor Charge (Max 7 Charges)."
        perks["warlock weaponry"] = "Shooting an enemy while being a Warlock will provide a 25% Chance to gain 1 Armor Charge (Max 7 Charges)."
        perks["titan weaponry"] = "Shooting an enemy while being a Titan will provide a 25% Chance to gain 1 Armor Charge (Max 7 Charges)."
    }

    private fun addWeaponPerks() {
        perks["void aegis"] = "Dealing damage can summon a protective swirling void orb."
        perks["repulsor brace"] = "Taking damage can provide a temporary overshield."
        perks["destabalizing rounds"] = "Dealing damage can occasionally fire off a slow moving, high damage dealing, void missile that weakens enemies." //todo that's currently in the game
        perks["destabilizing rounds"] = "Dealing damage can occasionally fire off a slow moving, high damage dealing, void missile that weakens enemies."
        perks["volatile"] = "Dealing damage can cause enemies to have a delayed void explosion"

        perks["incandescent"] = "Dealing damage can cause a scorching blast to occur on a targetr, dealing solar damage to any enemies nearby."
        perks["pulse monitor"] = "Dealing damage can occasionally heal you for 15% health"
        perks["noble seeker"] = "Dealing damage can cause an enemy to release a slow moving healing missile to you, or the nearest ally, regenerating 30% health on contact."
        perks["unstable"] = "Taking damage can cause a scorching blast to occur around you, dealing increased solar damage to any enemies nearby."

        perks["voltshot"] = "Dealing damage can create a slowing damage chain to nearby enemies."
        perks["grounded missile"] = "Dealing damage can fire a fast moving low damage missile to both slows and launches enemies far away."
        perks["reactive"] = "taking damage can occasionally release micro-missiles that hunt down and slow enemies."
        perks["amplified"] = "Dealing damage can occasionally increase your speed by 20%."

        perks["dark ambitions"] = "You gain 2+ damage when it is night."
        perks["perpetual motion"] = "Dealing damage while sprinting will regenerate hunger."
        perks["light provides"] = "Dealing damage during daytime will regenerate hunger."
        perks["quickdraw"] = "Firing this weapon within 1.5 seconds of equipping it will increase damage by 1."
        perks["timed payload"] = "Dealing damage causes a delayed explosion."
        perks["vorpal"] = "Increases damage by 1 if target has 10+ HP."
        perks["hunger pangs"] = "Occasionally consume twice as much ammo, but deal increased damage (+18 for Primary, +26 for Special, +38 for Heavy)." // todo
        perks["high-caliber rounds"] = "Has a chance to knock away enemies."
        perks["glass half full"] = "You gain +3 Damage when your ammo is low (45- for Primary, 45- for Special, 4- for Heavy)." // todo
        perks["firmly planted"] = "While immobile, dealing damage will occasionally regenerate extra hunger."
        perks["smorgasbord"] = "Dealing damage will cause a random effect to you."
        perks["mulligan"] = "When firing this weapon, there is a chance a bullet is refunded."
        perks["surrounded"] = "When damaged, you temporarily stun up to three combatants."
        perks["kinetic tremors"] = "Dealing damage can unleash a shockwave that damages nearby enemies."
        perks["two fang"] = "When firing, an occasional extra Kinetic round may fire from the weapon, dealing extra damage."
        perks["focused fury"] = "While immobile, you deal 2+ Damage while firing."
        perks["looting"] = "Defeating enemies may yield extra rewards."
        perks["tracking module"] = "Firing at a target will cause the rocket to give chase. Not looking at a target however, will cause the rocket to be a dud."

        perks["chill clip"] = "Dealing damage can cause a freezing blast that will cause all nearby enemies to shatter."
        perks["headstone"] = "Dealing damage will occasionally summon a Crystal that will explode on death."

        perks["vindicate"] = "Dealing damage heals you by 2 hearts."
        perks["alacrity"] = "Dealing damage heals nearby allies."

        perks["tangled"] = "Dealing damage will occasionally toss a tangle bomb that will pull all nearby enemies to where it lands."
        perks["hatchling"] = "Dealing damage will occasionally summon a Threadling that will attack nearby foes."
    }
}

