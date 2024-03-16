package cn.paper_card.paper_token.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

@SuppressWarnings("unused")
public interface TokenService {
    @NotNull UUID create(@NotNull UUID playerId) throws Exception;

    @Nullable TokenInfo query(@NotNull UUID token) throws Exception;
}
