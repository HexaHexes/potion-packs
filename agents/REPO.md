# Repo rules - Potion Packs

Repo-specific rules and notes. The org-wide `AGENTS.md` beside this file is
maintained in `neoforge-mod-template` and pulled in verbatim - **never hand-edit it.**
Everything in this file is this repo's own and is edited freely; keep it aligned
with the org rules rather than restating them.

**Repo:** `HexaHexes/potion-packs` · **Mod ID:** `potionpacks` · **Branch:** `main`
**Jar:** `build/libs/potionpacks-<version>.jar`

Registers potions for existing effects from external folder or zip packs.

**Test:** no GameTest suite in this repo - verify with `./gradlew build`, and with
`./gradlew runData` after touching generated content (the README's development
workflow).

**Remote:** `github.com/HexaHexes/potion-packs` (public, default branch `main`).

---

## Notes

- This repo predates the org's current workflow conventions: it ships no
  `.github/workflows` at all (no CI checks run on its PRs) and its README states
  its own licence terms ("All Rights Reserved") rather than the org's LGPL-2.1
  default. Bring it onto the org baseline deliberately, not as a drive-by.
