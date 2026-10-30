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

## Maintenance mode

This repo is in maintenance mode (owner decision, 2026-10-30): **it keeps up with
the template but gets no new features of its own** until the mode lifts.

- Included in every template wave - rulebook pulls, dependency pins, CI and
  tooling updates, and new template content land here as they do everywhere.
- No repo-initiated feature work while the mode lasts.

Decision: `HexaHexes/neoforge-mod-template#52` (maintenance-mode note);
tracking: `HexaHexes/neoforge-mod-template#60`.
## Notes

- This repo predates the org's current workflow conventions: it ships no
  `.github/workflows` at all (no CI checks run on its PRs) and its README states
  its own licence terms ("All Rights Reserved") rather than the org's LGPL-2.1
  default. Bring it onto the org baseline deliberately, not as a drive-by.
