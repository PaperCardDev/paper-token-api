package cn.paper_card.paper_token.api;

import org.jetbrains.annotations.NotNull;


@SuppressWarnings("unused")
public interface PaperTokenApi {
    @NotNull TokenService getTokenService();

    @NotNull Object getServletContextHandler();
}